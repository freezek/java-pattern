package com.ikaimen.javase;

import java.util.*;

/**
 * @ClassName TestIntger2String
 * @Description TODO
 * @Author chentao
 * @Date 2019/9/2 2:37 PM
 * @ModifyDate 2019/9/2 2:37 PM
 * @Version 1.0
 */
public class TestIntger2String {


    public static void main(String[] args) {

        Set<String> node = new HashSet<>();
        node.add("round0");
        node.add("round1");
        node.add("round3");
        node.add("round4");

        List<String> list1 = new ArrayList<>();

        list1.add("round0");
        list1.add("round2");

        List<String> list2 = new ArrayList<>();

        list2.add("round0");
        list2.add("round3");

        List<String> list3 = new ArrayList<>();

        list3.add("round1");

        Map<String, List<String>> map = new HashMap<>();
        map.put("round1", list1);
        map.put("round2", list2);
        map.put("round3", list3);

        Set<String> result = new HashSet<>();

        int round = 0;

        System.out.println(getAllFoundNodes(node, map, result, round));

        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        if (isCyclic(graph)) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph doesn't "
                    + "contain cycle");
        }
    }


    /**
     * @param prenode         当前节点
     * @param map             图谱关系
     * @param result          上次递归的结果
     * @param foundNodesCount 递归总轮次
     * @return
     * @Description 递归找所有前置 尾递归
     * @Author Norman
     * @Date 2019/9/3 2:51 下午
     * @ModifyDate 2019/9/3 2:51 下午
     */
    public static Set<String> getAllFoundNodes(Set<String> prenode, Map<String, List<String>> map,
                                               Set<String> result, int foundNodesCount) {
        //每递归一次增加 1
        foundNodesCount++;
        //当前知识点的所有前后置
        Set<String> strings = new HashSet<>();
        int over = 0;
        for (String string : prenode) {
            if (null != map.get(string)) {
                //当前知识点的前置
                List<String> str = map.get(string);
                for (String string2 : str) {
                    strings.add(string2);
                    result.add(string2);
                }
                over++;
            }

        }
        if (over == 0) {
            //返回当前递归的结果
            return result;
        }

        if (map.keySet().size() < foundNodesCount) {
            List<String> list = new ArrayList<String>();
            list.add("err");
            return new HashSet<String>(list);
        }

        return getAllFoundNodes(strings, map, result, foundNodesCount);
    }

    static class Graph {

        private final int V;
        private final List<List<Integer>> adj;

        public Graph(int V) {
            this.V = V;
            adj = new ArrayList<>(V);

            for (int i = 0; i < V; i++) {
                adj.add(new LinkedList<>());
            }
        }

        private void addEdge(int source, int dest) {
            adj.get(source).add(dest);
        }
    }

    private static boolean isCyclicUtil(int i, boolean[] visited,
                                        boolean[] recStack, Graph graph) {

        // Mark the current node as visited and
        // part of recursion stack
        if (recStack[i]) {
            return true;
        }

        if (visited[i]) {
            return false;
        }

        visited[i] = true;

        recStack[i] = true;
        List<Integer> children = graph.adj.get(i);

        for (Integer c : children) {
            if (isCyclicUtil(c, visited, recStack, graph)) {
                return true;
            }
        }

        recStack[i] = false;

        return false;
    }


    private static boolean isCyclic(Graph graph) {


        int nodeSize = graph.V;

        boolean[] visited = new boolean[nodeSize];
        boolean[] recStack = new boolean[nodeSize];

        for (int i = 0; i < nodeSize; i++) {
            if (isCyclicUtil(i, visited, recStack, graph)) {
                return true;
            }
        }

        return false;
    }

}
