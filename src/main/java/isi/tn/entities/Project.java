package isi.tn.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;



@Entity
public class Project implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="projectid")
	private Long id;
	private String title;
	private String description;
	
	
	@OneToMany(mappedBy="porjects",cascade = CascadeType.ALL)
	private Set<Sprint> sprints;
	
	@ManyToMany (cascade = CascadeType.ALL)
	@JoinTable(name="prjectuser",
	joinColumns={@JoinColumn(name="projectid")}, 
	inverseJoinColumns={@JoinColumn(name ="userid")})
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<User> userst;

	
	
	public Project(Long id, String title, String description, Set<Sprint> sprints) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.sprints = sprints;
	}
	public Set<Sprint> getSprints() {
		return sprints;
	}
	public void setSprints(Set<Sprint> sprints) {
		this.sprints = sprints;
	}
	public Project() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	

}
