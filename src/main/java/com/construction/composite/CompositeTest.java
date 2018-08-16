package com.construction.composite;

/**
 * @description: 组合模式测试
 * @author: ziHeng
 * @create: 2018-08-09 20:06
 **/
public class CompositeTest {

    public static void main(String[] args) {

        //树枝1(分支1)
        Branch branch1 = new Branch("树枝1");
        Leaf leaf1 = new Leaf("叶子1");
        Leaf leaf2 = new Leaf("叶子2");
        branch1.add(leaf1);
        branch1.add(leaf2);

        //树枝2(分支2)
        Branch branch2 = new Branch("树枝2");
        Leaf leaf3 = new Leaf("叶子3");
        Leaf leaf4 = new Leaf("叶子4");
        branch2.add(leaf3);
        branch2.add(leaf4);

        //一棵树(总分支)
        Tree tree = new Tree();
        tree.add(branch1);
        tree.add(branch2);

        //总分支展示
        tree.display();


    }

}
