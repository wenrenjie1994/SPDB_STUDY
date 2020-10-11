package com.longyx.study.design.pattern.iterator.general;

/**
 * 迭代器模式适用场景：
 * 1、访问一个集合对象的内容而无需暴露它的内部表示
 * 2、为遍历不同的集合结构提供一个统一的访问接口
 * 优点：
 * 1、多态迭代：为不同的聚合结构提供一致的遍历接口，即一个迭代接口可以访问不同的聚集对象
 * 2、简化集合对象接口：迭代器模式将集合对象本身应该提供的元素迭代接口抽取到了迭代器中，使集合对象无需关心具体迭代行为
 * 3、元素迭代功能多样化：每个集合对象都可以提供一个或多个不同的迭代器，使得同种元素聚合结构可以有不同的迭代行为
 * 4、解耦迭代与集合：迭代器模式，封装了具体的迭代算法，迭代算法的变化，不会影响到集合对象的架构。
 * 缺点：
 * 1、对于比较简单的遍历(像数组或者有序列表),使用迭代器方式较为繁琐
 * @author Mr.Longyx
 * @date 2020年07月11日 10:44
 */
public interface Iterator<E> {
    E next();
    boolean hashNext();
}
