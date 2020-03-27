package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MetadataFileDownload.class)
public abstract class MetadataFileDownload_ {

	public static volatile SingularAttribute<MetadataFileDownload, Integer> metadataId;
	public static volatile SingularAttribute<MetadataFileDownload, String> fileName;
	public static volatile SingularAttribute<MetadataFileDownload, String> requesterMail;
	public static volatile SingularAttribute<MetadataFileDownload, String> downloadDate;
	public static volatile SingularAttribute<MetadataFileDownload, String> requesterName;
	public static volatile SingularAttribute<MetadataFileDownload, String> requesterOrg;
	public static volatile SingularAttribute<MetadataFileDownload, Integer> id;
	public static volatile SingularAttribute<MetadataFileDownload, Integer> fileUploadId;
	public static volatile SingularAttribute<MetadataFileDownload, String> userName;
	public static volatile SingularAttribute<MetadataFileDownload, String> requesterComments;

}

