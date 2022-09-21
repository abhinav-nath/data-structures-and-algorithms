package com.codecafe.datastructures.trie;

import java.util.ArrayList;
import java.util.List;

public class Trie {

  private final TrieNode root;

  public Trie(List<String> words) {
    root = new TrieNode();

    for (String word : words)
      root.insert(word);
  }

  public boolean find(String prefix, boolean exact) {
    TrieNode lastNode = root;

    for (char c : prefix.toCharArray()) {
      lastNode = lastNode.getChildren().get(c);
      if (lastNode == null)
        return false;
    }

    return !exact || lastNode.isWord();
  }

  public boolean find(String prefix) {
    return find(prefix, false);
  }

  public void suggestHelper(TrieNode root, List<String> list, StringBuilder curr) {
    if (root.isWord()) {
      list.add(curr.toString());
    }

    if (root.getChildren() == null || root.getChildren().isEmpty())
      return;

    for (TrieNode child : root.getChildren().values()) {
      suggestHelper(child, list, curr.append(child.getC()));
      curr.setLength(curr.length() - 1);
    }
  }

  public List<String> suggest(String prefix) {
    List<String> list = new ArrayList<>();
    TrieNode lastNode = root;
    StringBuilder curr = new StringBuilder();

    for (char c : prefix.toCharArray()) {
      lastNode = lastNode.getChildren().get(c);
      if (lastNode == null)
        return list;
      curr.append(c);
    }

    suggestHelper(lastNode, list, curr);
    return list;
  }

}
