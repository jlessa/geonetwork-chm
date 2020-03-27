package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.MapAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MetadataCategory.class)
public abstract class MetadataCategory_ {

	public static volatile MapAttribute<MetadataCategory, String, String> labelTranslations;
	public static volatile SetAttribute<MetadataCategory, Metadata> records;
	public static volatile SingularAttribute<MetadataCategory, String> name;
	public static volatile SingularAttribute<MetadataCategory, Integer> id;

}

