package asd.labs.lab4.composite_pattern;

public class File extends Link{
private int sizeInBytes;
public File(String name, int sizeInBytes) {
this.name = name;
this.sizeInBytes = sizeInBytes;
}
public int getSizeInBytes() {
return sizeInBytes;
}
public void print(){
System.out.println("--- file "+name+" size="+getSizeInBytes()+"bytes");
}
@Override
public int getSize() {
	return getSizeInBytes();
}
}