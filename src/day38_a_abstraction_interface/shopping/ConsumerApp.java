package day38_a_abstraction_interface.shopping;

import day35_inheritance.multiLevelInheritance.C;

public interface ConsumerApp extends AllowUserToSell, Shipping{

}

abstract class TestA implements AllowUserToSell, Shipping {

}

abstract class TestB implements ConsumerApp{

}
