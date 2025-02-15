/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj301demo.Users;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import prj301demo.utils.DBUtils;

/**
 *
 * @author DUNGHUYNH
 */
public class UserDAO {

    public UserDTO login(String username, String password) {
        String sql = "select username from users where username = ? and password = ? ";
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                UserDTO user = new UserDTO();
                user.setUsername(rs.getString("username"));
                return user;
            }
        } catch (SQLException ex) {
            System.out.println("Login is wrong!" + ex.getMessage());
        }
        return null;
    }
}
