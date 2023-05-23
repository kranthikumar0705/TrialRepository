package com.kranthi.app;

import java.util.List;

import com.kranthi.app.entity.StudentEntity;
import com.kranthi.app.hqlrepository.AppHqlRepository;
import com.kranthi.app.repository.StudentRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        StudentEntity entity=new StudentEntity();
       // entity.setMarks(93);
        entity.setName("tom");
        entity.setSurname("jerry");
       // entity.setAddress("talvaipadu");
       StudentRepository repository = new  StudentRepository();
      // repository.save(entity);
      // System.out.println(repository.findById(3));
       
      //repository.update(entity,2); 
      // repository.delete(5);
   //**************************************************************************************
      //hql operations
      AppHqlRepository hqlRepository = new  AppHqlRepository();
      List<StudentEntity> list = hqlRepository.findAll();
     //list.stream().forEach(System.out::println);
      //hqlRepository.deleteByName("tom");
      List<StudentEntity> list2 = hqlRepository.findByname("kranthi");
      //list2.stream().forEach(each->{System.out.println(each);});
      hqlRepository.updateByName("kranthi","sanjay");
      
    }
}
