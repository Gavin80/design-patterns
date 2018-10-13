package com.gavin.composite;

public interface Component {
    void operation();
    void add(Component component);
    void remove(Component component);
    Component getChild(int index);
}

interface Leaf extends Component{

}

interface Composite extends Component {

}
