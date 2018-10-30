package _01;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class Test {
  private static map MAP=new map();
  int flag=0;
  @Test
  void testNeighbor_01() {
    if(MAP.neighbor(0, 0)==0)
      flag = 1;
    else
      flag = 0;
    assertEquals(1,flag);
  }
  //neighborһ�����  
  @Test
  void testNeighbor_02() {
    if(MAP.neighbor(3, 9)==1)
      flag = 1;
    else
      flag = 0;
    assertEquals(1,flag);
  }
  //neighborһ�����
  @Test
  void testNeighbor_03() {
    if(MAP.neighbor(4, 10)==3)
      flag = 1;
    else
      flag = 0;
    assertEquals(1,flag);
  }

  @Test
  void testJudge() {
    if(MAP.judge(4, 10)==1)
      flag = 1;
    else
      flag = 0;
    assertEquals(1,flag);
  }

  @Test
  void testUpdate_map() {
    MAP.update_map();
    if(MAP.new_map[0][0]==0&&MAP.new_map[4][10]==1&&MAP.new_map[7][11]==0)
      flag = 1;
    else
      flag = 0;
    assertEquals(1,flag);
  }

  @Test
  void testCopy_map() {
    MAP.copy_map();
    flag = 1;
    for(int i=0;i<41;i++)
      for(int j=0;j<36;j++)
        if(MAP.map[i][j]!=MAP.new_map[i][j])
          flag = 0;
    assertEquals(1,flag); 
  }

}
