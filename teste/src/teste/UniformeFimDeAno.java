package teste;

import java.io.IOException;
import java.util.*;

public class UniformeFimDeAno{    
  private String name;
  private String uniformSize;
  private String uniformColor;

  public String getUniformColor() {
    return this.uniformColor;
  }

  public void setUniformColor(String uniformColor) {
    this.uniformColor = uniformColor;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUniformSize() {
    return this.uniformSize;
  }

  public void setUniformSize(String uniformSize) {
    this.uniformSize = uniformSize;
  }

  public UniformeFimDeAno(String name, String uniformColor, String uniformSize){
    this.name = name;
    this.uniformColor = uniformColor;
    this.uniformSize = uniformSize;
  }

  public void printStudentInfos(){
      System.out.println(this.uniformColor + " " + uniformSize + " " + name);
  }
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.nextLine();
    ArrayList<UniformeFimDeAno> arrayUniforms= new ArrayList<>(N);
    String name, uniformDetails, uniformColor, uniformSize;

    for(int i = 0; i < N; i++){
      name = scanner.nextLine();
      uniformDetails = scanner.nextLine();  
      uniformColor = uniformDetails.split(" ")[0];
      uniformSize= uniformDetails.split(" ")[1];

      arrayUniforms.add(new UniformeFimDeAno(name, uniformColor, uniformSize));
    }

    scanner.close();

    //Collections.sort(arrayUniforms);
    //Collections.sort(arrayUniforms, Comparator.comparing(YearEndUniform::getUniformColor));//.
    //thenComparing(YearEndUniform::getUniformSize).reversed().thenComparing(YearEndUniform::getName));

    //Collections.sort(arrayUniforms, Comparator.comparing(YearEndUniform::getUniformSize).reversed());
    //Collections.sort(arrayUniforms, Comparator.comparing(YearEndUniform::getName));
    
    Collections.sort(arrayUniforms, new UniformComparator());

    for(var item : arrayUniforms){
      item.printStudentInfos();
    }
  }

  static class UniformComparator implements Comparator<UniformeFimDeAno>{
    @Override
    public int compare(UniformeFimDeAno student0, UniformeFimDeAno student1) {
      int res = student0.uniformColor.compareTo(student1.uniformColor);
    
      if(res == 0){
        res = student0.uniformSize.compareTo(student1.uniformSize);
        if(res == 0){
          res = student0.name.compareTo(student1.name);
        }
        else{
        //reverts order based on size
          res = -res;
        }
    }

    return res;
  }
  }

}