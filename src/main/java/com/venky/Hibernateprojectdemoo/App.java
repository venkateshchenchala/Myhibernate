package com.venky.Hibernateprojectdemoo;

import java.util.List;
import com.venky.Hibernateprojectdemoo.Configuration.SupermarketRepository;
import com.venky.Hibernateprojectdemoo.Dto.SupermarketDto;
import com.venky.Hibernateprojectdemoo.Entity.Supermarket;

public class App 
{
    public static void main( String[] args )
    {
//    	SupermarketDto d=new SupermarketDto(4,"Coconut",23);
//    	d.setId(4);
//    	d.setName("Coconut");
//    	d.setPrice(16); 
    	Supermarket v=new Supermarket();
       v.setId(1);
       v.setName("nivya fashwash");
       v.setPrice(67);
       SupermarketRepository r=new SupermarketRepository();
       r.saveObjects(v);
//       r.getObjects(4);
//       r.updateObject(d);
//       r.deleteObject(4);
       
    }
}
