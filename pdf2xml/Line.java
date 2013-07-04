/*
    Copyright 2005, 2005 Burcu Yildiz
    Contact: burcu.yildiz@gmail.com
    
    This file is part of pdf2table.
*/

package pdf2xml;

import java.util.*;

public class Line {

  Vector texts;
  
  int top;
  int bottom;
  int height;
  int leftmost;
  int rightmost;
  int font;  
  int last_top;
  int first_top;
  int used_space;
  String typ;
  
  public Line() {
    this.texts = new Vector();	            
  }
}