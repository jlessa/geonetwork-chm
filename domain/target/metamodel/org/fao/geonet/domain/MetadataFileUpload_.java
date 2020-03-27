package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MetadataFileUpload.class)
public abstract class MetadataFileUpload_ {

	public static volatile SingularAttribute<MetadataFileUpload, Integer> metadataId;
	public static volatile SingularAttribute<MetadataFileUpload, String> fileName;
	public static volatile SingularAttribute<MetadataFileUpload, String> uploadDate;
	public static volatile SingularAttribute<MetadataFileUpload, Double> fileSize;
	public static volatile SingularAttribute<MetadataFileUpload, String> deletedDate;
	public static volatile SingularAttribute<MetadataFileUpload, Integer> id;
	public static volatile SingularAttribute<MetadataFileUpload, String> userName;

}

