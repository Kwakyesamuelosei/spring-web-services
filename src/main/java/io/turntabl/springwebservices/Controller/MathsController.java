package io.turntabl.springwebservices.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.turntabl.springwebservices.Transfers.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class MathsController {

    @Autowired
    private Maths maths;

    @ApiOperation("Add Two Ints")
    @GetMapping("/maths/add")
    public Number add(@RequestParam(name = "num_1",defaultValue = "1") Integer num_1, @RequestParam(name = "num_2",defaultValue = "1") Integer num_2){
        Integer total = maths.add(num_1,num_2);
        Number number = new Number();
        number.setValue(total);
        return number;
    }

    @ApiOperation("Subtracting Two Ints")
    @GetMapping("/maths/subtract")
    public Number subtract(@RequestParam(name = "num_1",defaultValue = "1") Integer num_1, @RequestParam(name = "num_2",defaultValue = "1") Integer num_2){
        Integer total = maths.subtract(num_1,num_2);
        Number number = new Number();
        number.setValue(total);
        return number;
    }

}
