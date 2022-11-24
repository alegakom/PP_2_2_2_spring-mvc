package web;

import org.hibernate.SessionFactory;
import web.DAO.UserDaoImpl;
import web.Util.Util;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        Util.getConnection();
    }
}
