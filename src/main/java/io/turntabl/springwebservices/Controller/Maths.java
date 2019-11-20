package io.turntabl.springwebservices.Controller;

import io.turntabl.springwebservices.Transfers.Number;
import org.springframework.context.annotation.Bean;

public class Maths {

    public Integer add(Integer num_1,Integer num_2){
        Integer total = num_1 + num_2;
        return total;
    }

    public Integer subtract(Integer num_1,Integer num_2){
        Integer total = num_1 - num_2;
        return total;
    }
}
