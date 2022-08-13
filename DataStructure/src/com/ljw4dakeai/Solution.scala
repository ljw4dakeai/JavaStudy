package com.ljw4dakeai

object Solution {

    //两数相加
    //  def main(args: com.ljw4dakeai.Array[String]): Unit = {
    //    val array: com.ljw4dakeai.Array[Int] = List[Int](2, 7 , 5 ,9).toArray
    //    val target = 9
    //    println(twoSum(array, target).mkString("com.ljw4dakeai.Array(", ", ", ")"))
    //    println(twosum(array, target).mkString("com.ljw4dakeai.Array(", ", ", ")"))
    //  }
    //
    //  def twoSum(nums: com.ljw4dakeai.Array[Int], target: Int): com.ljw4dakeai.Array[Int] = {
    //    var array = new com.ljw4dakeai.Array[Int](2)
    //    for (i <- nums.indices; j <- i+1 until  nums.length){
    //      if (nums(i)  + nums(j) == target){
    //       array = List[Int](i, j).toArray
    //      }
    //    }
    //    array
    //  }
    //
    //
    //  def twosum(nums: com.ljw4dakeai.Array[Int], target: Int): com.ljw4dakeai.Array[Int] = {
    //    var array = new com.ljw4dakeai.Array[Int](2)
    //    val map: mutable.HashMap[Int, Int] = new mutable.HashMap[Int, Int]()
    //    for (i <- nums.indices) map.put(nums(i), i)
    //    for (i <- nums.indices){
    //      if (map.contains(target - nums(i)) && map(target - nums(i)) != i ){
    //        array = List[Int](map(target - nums(i)), i).toArray
    //      }
    //    }
    //    array
    //  }

    // 两个链表相加
    //  class ListNode(_x: Int = 0, _next: ListNode = null) {
    //    var next: ListNode = _next
    //    var x: Int = _x
    //
    //  }
    //  def main(args: com.ljw4dakeai.Array[String]): Unit = {
    //    val listNode1: ListNode = new ListNode(1)
    //    val listNode2: ListNode = new ListNode(2)
    //
    //
    //  }
    //
    //  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    //    (l1, l2) match {
    //      case (l1, null) => l1
    //      case (null, l2) => l2
    //      case (l1, l2 ) => {
    //        val d = (l1.x + l2.x) /10 //进位数
    //        val r = (l1.x + l2.x) % 10 //进位后余数
    //        val list = new ListNode(r)
    //
    //        val next = if (d > 0) addTwoNumbers(new ListNode(1), addTwoNumbers(l1.next, l2.next)) //d>0 表示会进位1
    //        else addTwoNumbers(l1.next, l2.next) //d < 0 表示不会进位1
    //
    //        list.next = next
    //
    //        list
    //      }
    //    }
    //
    //  }


    //多x树的遍历
    //  class Node(var _value: Int) {
    //  var value: Int = _value
    //  var children: List[Node] = List()
    //   }
    //
    ////  def preorder(root: Node): List[Int] = {
    ////      def order: Node => List[Int] = node => node.children.flatMap(child => child.value +: order(child))
    ////      Option(root).fold(List[Int]())(root => root.value::order.apply(root))
    ////  }
    //
    ////  def preorder(root: Node): List[Int] = {
    ////    def neworder(node: Node): List[Int] = {
    ////      node.children.flatMap(child => child.value +: neworder(child))
    ////    }
    ////    Option(root).fold(List[Int]())(root => root.value :: neworder(root))
    ////  }
    //
    //  def newpreorder(root: Node): List[Int] ={
    //    root match {
    //      case null => List[Int]()
    //      case _ => {
    //        def order: Node => List[Int] = node => node.children.flatMap(child => child.value +: order(child))
    //        root.value :: order(root)
    //      }
    //    }
    //  }


    //回文串
    //  def isPalindrome(x: Int): Boolean = {
    //    x match {
    //      case y if y < 0 => false
    //      case y if y == 0 => true
    //      case _ => x.toString == x.toString.reverse
    //    }
    //  }


    // 完整括号
    //  def isValid(s: String): Boolean = {
    //    import scala.collection.mutable
    //
    //    if (s.length % 2 != 0) return false //有不为完整的括号
    //
    //    val map = Map('(' -> ')', '[' -> ']', '{' -> '}')
    //    val stack = mutable.Stack[Char]()
    //    for (ch <- s){
    //      if  (map.contains(ch)) stack.push(ch)
    //      else if (stack.isEmpty || ch != map(stack.pop())) return false
    //    }
    //    stack.isEmpty
    //  }
    //
    //  def main(args: com.ljw4dakeai.Array[String]): Unit = {
    //    val s="{}[]{}{[]}"
    //    println(isValid(s))
    //  }


    // 两个有序链表合并
    //  case class ListNode(_x: Int = 0, _next: ListNode = null) {
    //    var next: ListNode = _next
    //    var x: Int = _x
    //  }
    //  def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
    //    (list1, list2) match {
    //      case (null, null) => null
    //      case (list1, null) => list1
    //      case (null, list2) => list2
    //      case _ => {
    //        if(list1.x < list2.x) ListNode(list1.x, mergeTwoLists(list1.next, list2))
    //        else ListNode(list2.x, mergeTwoLists(list2.next, list1))
    //      }
    //    }
    //
    //  }
    //  val listNode1 = ListNode(1)
    //  val listNode2 = ListNode(2)
    //  listNode1.next = listNode2
    //  listNode2.next = null
    //  val listNode3 = ListNode(-1)
    //  val listNode4 = ListNode(3)
    //  listNode3.next = listNode4
    //  listNode4.next = null
    //  println(mergeTwoLists(listNode1, listNode3))


    //
    //    def maxSubArray(nums: com.ljw4dakeai.Array[Int]): Int = {
    //      /** [-2,1,-3,4,-1,2,1,-5,4]
    //       * 子问题 1：经过 -2−2 的连续子数组的最大和是多少；                    子问题 1：以 -2−2 结尾的连续子数组的最大和是多少；
    //       * 子问题 2：经过 11 的连续子数组的最大和是多少；                      子问题 2：以 11 结尾的连续子数组的最大和是多少；
    //       * 子问题 3：经过 -3−3 的连续子数组的最大和是多少；                    子问题 3：以 -3−3 结尾的连续子数组的最大和是多少；
    //       * 子问题 4：经过 44 的连续子数组的最大和是多少；                      子问题 4：以 44 结尾的连续子数组的最大和是多少；
    //       * 子问题 5：经过 -1−1 的连续子数组的最大和是多少； => 子问题转化 =>     子问题 5：以 -1−1 结尾的连续子数组的最大和是多少；
    //       * 子问题 6：经过 22 的连续子数组的最大和是多少；                      子问题 6：以 22 结尾的连续子数组的最大和是多少；
    //       * 子问题 7：经过 11 的连续子数组的最大和是多少；                      子问题 7：以 11 结尾的连续子数组的最大和是多少；
    //       * 子问题 8：经过 -5−5 的连续子数组的最大和是多少；                    子问题 8：以 -5−5 结尾的连续子数组的最大和是多少；
    //       * 子问题 9：经过 44 的连续子数组的最大和是多少。                      子问题 9：以 44 结尾的连续子数组的最大和是多少。
    //       */
    //
    //
    //      //    mx[i] 最大子序数和 num[i]最后一个数
    //      //    mx[i] = mx[i-1] + num[i]
    //      //    但是 mx[i-1] 可能是正数，也可能是负数
    //      //    所以当mx[i-1]为负数时不需要再相加最后一个num[i]
    //      //    mx[i] = max{mx[i-1] + num[i] , num[i]}
    //      //    我们是一nump[i]为最后一个数，当前面的计算小于0时，我们不可能加上一个负数或者0，变成更小的数
    //      val mx = new com.ljw4dakeai.Array[Int](nums.length) // 开数组
    ////      val mx = com.ljw4dakeai.Array.fill[Int](nums.length)(0)
    //      mx(0) = nums(0) //初始条件 -> 当只有num中一个值时 最大值就是该值
    //
    //      for (i <- 1 until nums.length){
    //        if (mx( i - 1 ) > 0) mx(i) = mx( i - 1 ) + nums(i)
    //        else mx(i) = nums(i)
    //      }
    //
    //      var res = nums(0)
    //      for (result <- nums){
    //        if  (result > res) res = result
    //      }
    //      res
    //
    //
    //      //    var pre = 0;
    //      //    var res = nums(0);
    //      //    for ( num <- nums) {
    //      //      pre = Math.max(pre + num, num);
    //      //      res = Math.max(res, pre);
    //      //    }
    //      //    res
    //    }


    //  //链表的遍历
    //  case class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    //      var value: Int = _value
    //      var left: TreeNode = _left
    //      var right: TreeNode = _right
    //    }
    //
    //
    //  def inorderTraversal(root: TreeNode): List[Int] = {
    //    if (root == null) return Nil
    //    inorderTraversal(root.left) ::: List(root.value) ::: inorderTraversal(root.right)//中序遍历
    ////    List(root.value) ::: inorderTraversal(root.left) ::: inorderTraversal(root.right)//前序遍历
    ////    inorderTraversal(root.left) ::: inorderTraversal(root.right) ::: List(root.value)//后序遍历
    //    }


    //  def singleNumber(nums: com.ljw4dakeai.Array[Int]): Int = {
    //    val map = nums.map((_,1)).groupBy(_._1).map(value => (value._1, value._2.length))
    //
    //    var res = 0
    //    for (value <- map){
    //      if (value._2 == 1) res = value._1
    //    }
    //    res
    //
    //  }


//  def subsets(nums: com.ljw4dakeai.Array[Int]): List[List[Int]] = {
//    val listbuffers = mutable.ListBuffer[List[Int]]()
//
//    listbuffers.append(Nil)
//
//    nums.foreach(
//      num => listbuffers.toList.foreach(
//        listbuffer => listbuffers.append(listbuffer :+ num)
//      )
//    )
//
//    listbuffers.toList
//
//  }


//  def decompressRLElist(nums: List[Int]): List[Int] = {
//    nums.sliding(2, 2).map(list => List.fill(list.head)(list.tail).flatten).toList.flatten
//  }
//
//  def countOdds(low: Int, high: Int): Int = {
//
//    (low, high) match {
//      case (v1, v2) if (v1 % 2 == 0 && v2 % 2 == 0) => (v2 -v1) / 2
//      case (v1, v2) if (v1 % 2 == 1 && v2 % 2 == 1) => (v2 - v1) / 2 + 1
//      case _ => (high - low + 1) / 2
//     }
//
//  }


}
