/**
 * Created by wangzhen318 on 2017/4/12.
 */
package com.evan.strategy.version3;
/**
 * 将fly和quack分别抽出接口，不同的鸭子去分别实现这两个接口。
 * 但会造成每个鸭子子类都会出现重复实现的代码,而且如果要修改鸭子的飞行行为，所有会飞的鸭子行为实现都得改变，代码无法复用
 * */