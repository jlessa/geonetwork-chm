package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Service.class)
public abstract class Service_ {

	public static volatile SingularAttribute<Service, String> explicitQuery;
	public static volatile SingularAttribute<Service, String> name;
	public static volatile SingularAttribute<Service, String> description;
	public static volatile SingularAttribute<Service, String> className;
	public static volatile SingularAttribute<Service, Integer> id;
	public static volatile ListAttribute<Service, ServiceParam> parameters;

}

