package com.ljw4dakeai.Tree.HaffmanTree

import java.{lang, util}
import scala.collection.mutable

object HaffmanCode{

  def main(args: Array[String]): Unit = {

    val str: String = "i like like like java do you like a java"
    val bytes: Array[Byte] = str.getBytes()

    //对应ASKII
    println(bytes.mkString("-"))

    //节点对应权值
    getNods(bytes).forEach(print)

    //生成haffmanTree
    val HaffmanTreeRoot: Nodes = createHaffmaanTree(getNods(bytes))

    //对树进行前序遍历
    preOrder(HaffmanTreeRoot)

    //生成haffmancode
    getCodes(HaffmanTreeRoot, "", stringBuilder)
    println(haffmanCodes)
  }


//  //字符串->         com.ljw4dakeai.Array[Byte] ->          haffmancode map                  处理后的Array[Byte]
//  private def zip(bytes: com.ljw4dakeai.Array[Int], haffmanCodes: mutable.Map[Byte, String]): com.ljw4dakeai.Array[Byte] = {
//
//
//  }


  private def getNods(bytes: Array[Byte]): util.ArrayList[Nodes] ={

    val nodes: util.ArrayList[Nodes] = new util.ArrayList[Nodes]()

    val node: Map[Byte, Int] =
      bytes.groupBy(byte => byte)
        .map(value => (value._1, value._2.length))


    for (node <- node){
      nodes.add(new Nodes(node._1, node._2))
    }


    nodes
  }


  private def createHaffmaanTree(nodes: util.ArrayList[Nodes]): Nodes = {

    while (nodes.size > 1) {
      util.Collections.sort(nodes)

      val leftNode: Nodes = nodes.get(0)
      val rightNode: Nodes = nodes.get(1)
      val parent: Nodes = new Nodes( null.asInstanceOf[Byte], leftNode.weight + rightNode.weight)

      parent.left = leftNode
      parent.right = rightNode

      nodes.remove(leftNode)
      nodes.remove(rightNode)

      nodes.add(parent)
    }

    nodes.get(0)
  }


  private def preOrder(root: Nodes): Unit = {
    if (root != null) root.preOrder()
    else println("树为空")
  }


  val haffmanCodes: mutable.Map[Byte, String] = new mutable.HashMap()
  val stringBuilder: lang.StringBuilder = new lang.StringBuilder()
  private def getCodes(nodes: Nodes, code: String, stringBuilder: lang.StringBuilder ): Unit = {
    val builder: lang.StringBuilder = new lang.StringBuilder(stringBuilder)
    builder.append(code)

    if (nodes != null){
      //判断当前是叶子节点，还是非叶子节点
      if (nodes.data == null.asInstanceOf[Byte]){ //非叶子结点
        //递归处理

        getCodes(nodes.left, "0", builder)
        getCodes(nodes.right, "1",builder )

      }else {//叶子节点
        //就表示找到了叶子节点最后
        HaffmanCode.haffmanCodes.put(nodes.data, builder.toString)

      }
    }

  }

}



class Nodes extends Comparable[Nodes]{
  var data: Byte = _
  var weight: Int = _
  var left: Nodes = _
  var right: Nodes = _
  def this(data: Byte, weight: Int){
    this()
    this.data = data
    this.weight = weight

  }
  override def compareTo(o: Nodes): Int = this.weight - o.weight

  override def toString: String = s"Node{data=${data},weigit=${weight}}"


  def preOrder(): Unit ={
    println(this)
    if (this.left != null) this.left.preOrder()

    if (this.right != null) this.right.preOrder()
  }




}

