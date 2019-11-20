package io.turntabl.springwebservices.Implementors;

import io.turntabl.springgettingstarted.DAO.CustomerDAO;
import io.turntabl.springgettingstarted.Transfers.ProductTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RestController
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    @GetMapping("/customer")
    public List<ProductTo> getCustomerProducts(@RequestParam(value = "name",defaultValue = "Maria Anders") String name) {

        List<ProductTo> products = jdbcTemplate.query(
                "select products.product_name,products.unit_price from products inner join order_details on products.product_id = order_details.product_id inner join orders on order_details.order_id = orders.order_id inner join customers on orders.customer_id = customers.customer_id where customers.contact_name like ?",
                new Object[]{name + "%"},
                 BeanPropertyRowMapper.newInstance(ProductTo.class)
                );

        return products;
    }

}
