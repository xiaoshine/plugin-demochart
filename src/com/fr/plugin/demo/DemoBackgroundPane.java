package com.fr.plugin.demo;

import com.fr.extended.chart.ExtendedScrollPane;

import javax.swing.JPanel;

/**
 * Created by shine on 2018/3/25.
 */
public class DemoBackgroundPane extends ExtendedScrollPane<DemoChart>{
    @Override
    public void populateBean(DemoChart ob) {

    }

    @Override
    public void updateBean(DemoChart ob) {

    }

    @Override
    protected JPanel createContentPane() {
        return new JPanel();
    }

    @Override
    protected String title4PopupWindow() {
        return "背景";
    }
}
