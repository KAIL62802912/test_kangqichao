package com.controller;

import com.season.core.Controller;
import com.season.core.ControllerKey;
import com.season.core.db.Dao;
import com.season.core.db.SlaverDao;

/**
 * Created by kail on 2016/12/13.
 */
@ControllerKey("hello")
public class HelloController  extends Controller{

    public void season(){
        renderText("hello");

    }
}
