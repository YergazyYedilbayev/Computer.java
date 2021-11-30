package com.company;

public class Computer {
    private String name;
    private Vinchester vin;
    private Diskovod disk;
    private OP op;
    private Porcessor proc;
    private int mem;

    public Computer(String name, int Mem) {
        this.name = name;
        this.mem = Mem;
        this.disk = new Diskovod();
        this.op = new OP();
        this.vin = new Vinchester();
        this.proc = new Porcessor();
    }

    public void On(){
        System.out.println(name + ": Включен");
    }

    public void Off(){
        System.out.println(name + ": Выключен");
    }

    public void check(){
        System.out.println(name + ":");
        vin.Ch();
        disk.Ch();
    }

    public void ShowMem(){
        System.out.println(mem + "GB");
    }

    @Override
    public String toString(){
        return "Производитель: " + name;
    }

    @Override
    public int hashCode(){
        int result = vin.hashCode() + disk.hashCode() + op.hashCode() + proc.hashCode();
        result = 23 * result + name.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;

        Computer comp = (Computer) obj;

        if (obj == null || getClass() != obj.getClass()) return false;

        if(!vin.equals(comp.vin))
            return false;

        if(!disk.equals(comp.disk))
            return false;

        if(!op.equals(comp.op))
            return false;

        if(!proc.equals(comp.proc))
            return false;

        return name.equals(comp.name);
    }


}