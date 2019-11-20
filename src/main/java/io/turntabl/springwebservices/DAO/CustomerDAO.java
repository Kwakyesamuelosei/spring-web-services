package io.turntabl.springgettingstarted.DAO;


import io.turntabl.springgettingstarted.Transfers.ProductTo;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface CustomerDAO {
    public List<ProductTo> getCustomerProducts(String name);
}