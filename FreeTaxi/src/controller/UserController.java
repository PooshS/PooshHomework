package controller;

import exception.*;
import model.*;

import java.util.List;

public interface UserController {   // end point

    //
    User register(String login, String pass, String phone) throws RegisterException;

    // access token
    String login(String login, String pass) throws LoginCredentialException;

    Address checkAddress(Order order, String accessToken) throws InvalidAddressInfoException;

    Order makeOrder(Order orderRequest, double price, String accessToken) throws AppException;

    Order findDriver(Order order, String accessToken) throws AppException;

    Order getOrderInfo(int id, String accessToken) throws AppException;

    String cancelOrder(int orderId, String accessToken) throws AppException;

    List<Order> showHistory(String accessToken) throws AppException;

}
