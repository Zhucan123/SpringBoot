package com.zhucan.exm.domain;


import javax.persistence.*;

@Entity
@Table(name = "TESTZC")
public class TestZc {
    private Integer id;
    private String name;
    private String code;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mseq")
    @SequenceGenerator(name="mseq",sequenceName="V_VIDEO_ID_SEQ",allocationSize=1)
    @Column(name = "ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "TestZc{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
