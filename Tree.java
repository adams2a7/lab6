class Tree {
  private String treeName;
  private String treeType;
  private String leafColor;
  private boolean leavesFall;


  Tree(){
    treeName = "";
    treeType = "";
    leafColor = "";
    leavesFall = false;
    
  }

  Tree(String atreeName, String atreeType, String aleafColor, boolean aleavesFall){
    treeName = atreeName;
    treeType = atreeType;
    leafColor = aleafColor;
    leavesFall= aleavesFall;
  }

  void setName(String thetreeName){
    treeName = thetreeName;
  }

  void setType(String thetreeType){
    treeType = thetreeType;
  }

  void setColor(String theleafColor){
    leafColor = theleafColor;
  }
  
  void setLeavesFall(boolean theleavesFall){
    leavesFall = theleavesFall;
  }

  String getName(){
    return treeName;
  }

  String getType(){
    return treeType;
  }

  String getColor(){
    return leafColor;
  }

  String getLeavesFall(){
    if (!leavesFall){
      return "does not";
    } else {
      return "does" ; 
    }
  }

  void print() { 
    System.out.println("This is a "+getName()+" tree. It is a "+getType()+" and its leaves are currently "+getColor()+". It "+getLeavesFall()+" lose its leaves for the winter.");
  }  
}


