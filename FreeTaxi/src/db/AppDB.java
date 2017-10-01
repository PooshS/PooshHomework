package db;

import exception.LoginCredentialException;
import model.Order;
import model.User;

import java.util.*;

public class AppDB {

    private int userIdCount = 0;
    private long orderIdCount = 0;

    private Map<String, User> accessTokenUserMap;
    private Map<Integer, User> userMap;
    private Map<Long, Order> orderMap;
    private List<Order> history;
    private List<Order> newOrders;

    public AppDB(){

        userMap = new TreeMap<>();
        accessTokenUserMap = new HashMap<>();

        history = new ArrayList<>();
        newOrders = new LinkedList<>();

    }

    // register
    public User addUser(User user){
        user.setId(userIdCount);
        userMap.put(userIdCount, user);
        userIdCount++;
        return user;
    }

    // login
    public String createAccessToken(User user)throws LoginCredentialException{
        User found =
                userMap.values()
                        .stream()
                        .filter(u -> u.getPhone().equals(user.getPhone()))
                        .filter(u -> u.getPass().equals(user.getPass()))
                        .findFirst().get();
        if(found == null){
            throw new LoginCredentialException("invalid login or pass");
        } else {
            String accessKey = UUID.randomUUID().toString();
            accessTokenUserMap.put(accessKey, found);
            return accessKey;
        }

    }

    public Order addOrder(Order order){
        order.setId(orderIdCount);

        orderMap.put(orderIdCount, order);
        newOrders.add(order);

        orderIdCount++;

        return order;
    }

    public Order getOrderById(int id){
        return orderMap.get(id);
    }

    public boolean hasToken(String accessToken){
        return accessTokenUserMap.containsKey(accessToken);
    }

 /*   public Order cancelOrder(int id){
        Order order = orderMap.get(id);
        // notify driver
        return order;
    }*/

}
