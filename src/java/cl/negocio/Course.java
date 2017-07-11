package cl.negocio;

import cl.accesodato.Conexion;

public class Course {
    private String id;
    private String name;
    private String description;
    private String created_at;
    private String state;
    Conexion con;
    public Course(){
        con=new Conexion();
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public void save(){
        con.setInsertar("insert into courses(name,description,created_at,state)     values('"+this.getName()+"','"+this.getDescription()+"',now(),'"+this.getState()+"')");
    }
    public void update(){
        con.setInsertar("update courses set name='"+this.getName()+"', description='"+this.getDescription()+"' where id='"+this.getId()+"'");
    }
    public void delete(){
        con.setInsertar("update courses set state='pasive' where id='"+this.getId()+"'");
    }
}
