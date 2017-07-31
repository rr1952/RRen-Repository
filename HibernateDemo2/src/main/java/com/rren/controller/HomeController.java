package com.rren.controller;

/**
 * Created by Antonella on 7/26/17.
 */


import com.rren.models.CustomersEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// step 1 : import sql package
import java.sql.*;
import java.util.ArrayList;


@Controller
public class HomeController {

    @RequestMapping("/jdbc")
    // this example shows multiple rows being returned from our table
    public String dbReturn(Model model) throws ClassNotFoundException, SQLException {



        // step 2
        Class.forName("com.mysql.jdbc.Driver");

        // step 3
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind","Root2","grandcircus");

        // step 4
        Statement st = con.createStatement();

        //step 5
        ResultSet rs = st.executeQuery("select * from Customers");

        ArrayList<String> list = new ArrayList<String>();

        // step 6
        while (rs.next()) {
            String custName = rs.getString(1);
            String compName = rs.getString(2);
            String contName = rs.getString(3);

            // populate data into the arraylist
            list.add(custName + ", " + compName + ", " + contName);
        }

        model.addAttribute("dbResult", list);

        // step 7
        rs.close();
        con.close();

        return "jdbc";
    }

    @RequestMapping("/")
    public ModelAndView listCustomer() {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFact = cfg.buildSessionFactory();
        Session selectCustomers = sessionFact.openSession();
        selectCustomers.beginTransaction();
        //noinspection deprecation - using depreciated because I have no idea.
        Criteria c = selectCustomers.createCriteria(CustomersEntity.class);
        ArrayList<CustomersEntity>
                customerList = (ArrayList<CustomersEntity>) c.list();
        ArrayList<String> list = new ArrayList<String>();

        return new
                ModelAndView("welcome", "cList", customerList);
    }
/*
    @RequestMapping("/")
    // this example only shows one row from the table returned
    public ModelAndView helloWorld() throws ClassNotFoundException, SQLException {

        // prep for step 3 -- this is optional because we can assign directly in the connection
        String url = "jdbc:mysql://localhost:3306/northwind";
        String userName = "Root2";
        String password = "grandcircus";
        String query = "select * from products";

        // step 2: Load and Register the driver
        Class.forName("com.mysql.jdbc.Driver");

        // step 3: create connection
        Connection con = DriverManager.getConnection(url,userName,password);

        // step 4: create statement
        Statement st = con.createStatement();

        // step 5 (optional): retrieve results / execute query
        ResultSet rs = st.executeQuery(query);

        // step 6 (optional) : process results
        // we need to use the next() to move past the column headers for the first row of data in our table
        rs.next();

        // the get methods that are used to assign variables here are referencing the table column index
        // the index starts at 1 not 0
        String productID = rs.getString(1);
        String prodName = rs.getString(2);
        String supplierID = rs.getString(3);

        String printResult = productID + " " + prodName + " " + supplierID;

        // step 7 (optional) :
        rs.close();
        con.close();



        return new
                ModelAndView("welcome", "message", printResult);

    }
*/
}
