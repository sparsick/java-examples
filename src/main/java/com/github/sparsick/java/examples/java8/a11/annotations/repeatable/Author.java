package com.github.sparsick.java.examples.java8.a11.annotations.repeatable;

import java.lang.annotation.Repeatable;

@Repeatable(Authors.class)
@interface Author {
    String name();
}
