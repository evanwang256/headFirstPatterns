/**
 * Created by wangzhen318 on 2017/5/16.
 */
package com.evan.decorator.version1;

/**
 * 影响设计的因素或需求：
 * <p>
 * 1、调料价钱的改变会使我们更改现有代码
 * 2、出现新的调料需加上新的方法并修改超类中cost()方法
 * 3、以后开发出新饮料（如冰茶），某些调料可能不适合，但在这个设计中，Tea子类仍将继承那些不合适的方法。例如：hasWhip()(加奶泡)。
 * 4、顾客想要双倍摩卡咖啡，怎么办？
 */