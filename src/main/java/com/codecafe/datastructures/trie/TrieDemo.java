package com.codecafe.datastructures.trie;

import java.util.List;

public class TrieDemo {

  public static void main(String[] args) {
    List<String> words = List.of("hello", "dog", "hell", "cat", "a", "hel", "help", "helps", "helping");
    Trie trie = new Trie(words);
    System.out.println(trie.suggest("hel"));
  }

}