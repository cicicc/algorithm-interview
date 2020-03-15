package cn.algorithm.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description 146. LRU缓存机制
 * 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
 * <p>
 * 获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
 * 写入数据 put(key, value) - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。
 * <p>
 * 进阶:
 * <p>
 * 你是否可以在 O(1) 时间复杂度内完成这两种操作？
 * <p>
 * 解题思路：
 * 使用linkedHashMap，重写其remove方法
 * @Author: HaiBo Chen
 * @Date: 2020/3/15
 * @Time: 3:11 下午
 */
public class LRUCache {
    private int cacheCapacity;
    private LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.cacheCapacity = capacity;
        cache = new LinkedHashMap<Integer , Integer>(capacity, 1f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return cache.size() > cacheCapacity;
            }
        };
    }

    public int get(int key) {

        return cache.getOrDefault(key, -1);

    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
}
