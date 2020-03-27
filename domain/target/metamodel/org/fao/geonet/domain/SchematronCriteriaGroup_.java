package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SchematronCriteriaGroup.class)
public abstract class SchematronCriteriaGroup_ {

	public static volatile ListAttribute<SchematronCriteriaGroup, SchematronCriteria> criteria;
	public static volatile SingularAttribute<SchematronCriteriaGroup, SchematronCriteriaGroupId> id;
	public static volatile SingularAttribute<SchematronCriteriaGroup, SchematronRequirement> requirement;
	public static volatile SingularAttribute<SchematronCriteriaGroup, Schematron> schematron;

}

