package com.ttp.mvcframework.order;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@EqualsAndHashCode
@Getter
public class MenuItem {

    private final String name;
    private final int price;

}
