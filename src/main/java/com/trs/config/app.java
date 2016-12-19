package com.trs.config;

import com.season.core.Season;
import com.season.core.spring.SeasonApplication;
import com.season.core.spring.SeasonRunner;

/**
 * Created by kail on 2016/12/13.
 */
public class app extends SeasonApplication{
    public static void main(String[] args) {
        SeasonRunner.run(app.class);
    }
}
