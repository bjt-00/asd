package asd.labs.lab4.composite_pattern;

import java.util.ArrayList;
import java.util.Collection;

public class Drive extends Link {
private Collection<Link> linkList = new ArrayList<Link>();
public Drive(String name) {
this.name = name;
}
public void addFile(Link file){
	linkList.add(file);
}
public void addDir(Link directory){
linkList.add(directory);
}
public int computeSize(){
int sizeInBytes=0;
for (Link link : linkList){
sizeInBytes+=link.getSize();
}
return sizeInBytes;
}
public void print(){
System.out.println("- Link "+name);
for (Link link : linkList){
link.print();
}

}
@Override
public int getSize() {
	return computeSize();
}
}