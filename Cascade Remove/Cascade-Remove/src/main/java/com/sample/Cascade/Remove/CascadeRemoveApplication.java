package com.sample.Cascade.Remove;

import com.sample.Cascade.Remove.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class CascadeRemoveApplication {

	public static void main(String[] args) {

		SpringApplication.run(CascadeRemoveApplication.class, args);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );

		EntityManager em = emf.createEntityManager( );
		em.getTransaction().begin();


		Student s=em.find(Student.class, 101);
		em.remove(s);
		em.getTransaction().commit();

		em.close( );
		emf.close( );
	}

}
