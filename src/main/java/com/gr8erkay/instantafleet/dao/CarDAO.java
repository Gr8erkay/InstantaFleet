package com.gr8erkay.instantafleet.dao;

import com.gr8erkay.instantafleet.dbutil.DBUtil;
import com.gr8erkay.instantafleet.entity.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarDAO {

    public static List<Car> getAllProducts()
    {
        List<Car> carList = new ArrayList<>();
        try
        {
            Connection conn = DBUtil.getConnections();
            Statement st= conn.createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM product");
            while(rs.next())
            {
                Car car = new Car(rs.getString("prod_id"),rs.getString("prod_name"),rs.getString("prod_category"),rs.getInt("prod_price"));
                carList.add(car);
            }

            DBUtil.closeConnection(conn);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return carList;
    }


    public static Car getProductById(String productId)
    {
        Car car = null;
        try
        {
            Connection conn = DBUtil.getConnections();
            PreparedStatement ps= conn.prepareStatement("SELECT * FROM product WHERE prod_id = ?");
            ps.setString(1, productId);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                car = new Car(rs.getString("prod_id"),rs.getString("prod_name"),rs.getString("prod_category"),rs.getInt("prod_price"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return car;
    }


    public static int addProduct(Car car)
    {
        int status = 0;
        try
        {
            Connection conn = DBUtil.getConnections();
            PreparedStatement ps= conn.prepareStatement("INSERT INTO product VALUES(?,?,?,?)");
            ps.setString(1, car.getProductId());
            ps.setString(2, car.getProductName());
            ps.setString(3, car.getProductCategory());
            ps.setInt(4, car.getProductPrice());
            status = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }

    public static int updateProduct(Car car)
    {
        int status = 0;
        try
        {
            Connection conn = DBUtil.getConnections();
            PreparedStatement ps= conn.prepareStatement("UPDATE product SET prod_name=?, prod_category=?, prod_price=? WHERE prod_id=?");
            ps.setString(1, car.getProductName());
            ps.setString(2, car.getProductCategory());
            ps.setInt(3, car.getProductPrice());
            ps.setString(4, car.getProductId());
            status = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }

    public static int deleteProduct(String productId)
    {
        int status = 0;
        try
        {
            Connection conn = DBUtil.getConnections();
            PreparedStatement ps= conn.prepareStatement("DELETE FROM product where prod_id = ?");
            ps.setString(1, productId);
            status = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }

    public static void createProductTable() {
        try {
            Connection conn = DBUtil.getConnections();
            Statement st = conn.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS product (" +
                    "prod_id VARCHAR(50) PRIMARY KEY," +
                    "prod_name VARCHAR(100)," +
                    "prod_category VARCHAR(100)," +
                    "prod_price INT)";
            st.executeUpdate(createTableSQL);
            DBUtil.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
