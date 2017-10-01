package controller;

import db.AppDB;
import exception.*;
import model.Address;
import model.Order;
import model.OrderState;
import model.User;

import java.util.List;

public class UserControllerImpl implements UserController {

    private AppDB appDB;

    public UserControllerImpl() {
    }

    @Override
    public User register(String login, String pass, String phone) throws RegisterException {

        User user = new User();
        user.setName(login);
        user.setPass(pass);
        user.setPhone(phone);

        // validation user
        // if something wrong throw registerexception

        return appDB.addUser(user);
    }

    @Override
    public String login(String login, String pass) throws LoginCredentialException {

        User user = new User ();
        user.setName(login);
        user.setPass(pass);

        return appDB.createAccessToken(user);
    }

    @Override
    public Address checkAddress(Order order, String accessToken) throws InvalidAddressInfoException {
        // google map api



        return null;
    }

    @Override
    public Order makeOrder(Order orderRequest, double price, String accessToken) throws AppException {

        if(!appDB.hasToken(accessToken)){
            throw new AppException("no access, login first");
        }

        // validation
        // business logic
        // check address (optional)
        // use google api
        // count distance
        // count price

        return appDB.addOrder(orderRequest);
    }

    @Override
    public Order findDriver(Order order, String accessToken) throws AppException {

        if(!appDB.hasToken(accessToken)){
            throw new AppException("no access, login first");
        }



        return null;
    }

    @Override
    public Order getOrderInfo(int id, String accessToken) throws AppException {

        if(!appDB.hasToken(accessToken)){
            throw new AppException("no access, login first");
        }

        return appDB.getOrderById(id);
    }

    @Override
    public String cancelOrder(int orderId, String accessToken) throws AppException {

        Order found = getOrderInfo(orderId, accessToken);

        if(found == null){
            throw new NoOrderFoundException("no order with id " + orderId);
        }

        found.setOrderState(OrderState.CANCELED);
        User driver = found.getDriver();
        // notify driver
        // send message

        return "canceled order";
    }

    @Override
    public List<Order> showHistory(String accessToken) throws AppException {

        if(!appDB.hasToken(accessToken)){
            throw new AppException("no access, login first");
        }

        return null;
    }
}
