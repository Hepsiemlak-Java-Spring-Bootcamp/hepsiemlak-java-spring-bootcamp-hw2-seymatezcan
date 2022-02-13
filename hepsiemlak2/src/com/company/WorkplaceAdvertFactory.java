package com.company;

import java.util.ArrayList;
import java.util.List;

public class WorkplaceAdvertFactory implements AdvertFactory {
    List<WorkplaceAdvert>workplaceAdvertList=new ArrayList<>();
    @Override
    public void create() {
        WorkplaceAdvert workplaceAdvert=new WorkplaceAdvert("abddnz","dljlsgslkg",480000L);
        workplaceAdvertList.add(workplaceAdvert);

    }
}
