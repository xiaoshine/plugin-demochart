package com.fr.plugin.demo;

import com.fr.extended.chart.AbstractChart;
import com.fr.extended.chart.AbstractExtentChartProvider;

/**
 * Created by shine on 2018/3/24.
 */
public class Demo extends AbstractExtentChartProvider {
    @Override
    protected AbstractChart createChart() {
        return new DemoChart();
    }
}
