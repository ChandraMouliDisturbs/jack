
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
/* generated from migration version 20110324000133 */
package com.rapleaf.jack.test_project.database_1.models;

import java.io.IOException;
import java.util.Set;

import com.rapleaf.jack.test_project.database_1.IDatabase1;

import com.rapleaf.jack.ModelWithId;
import com.rapleaf.jack.BelongsToAssociation;
import com.rapleaf.jack.HasManyAssociation;
import com.rapleaf.jack.HasOneAssociation;

import com.rapleaf.jack.test_project.IDatabases;

public class User extends ModelWithId {
  // Fields
  private String __handle;
  private Long __created_at_millis;
  private int __num_posts;
  private Long __some_date;
  private Long __some_datetime;
  private String __bio;
  private byte[] __some_binary;
  private Double __some_float;
  private Boolean __some_boolean;

  // Associations
  private HasManyAssociation<Post> __assoc_posts;
  private HasManyAssociation<Comment> __assoc_comments;
  private HasOneAssociation<Image> __assoc_image;

  public enum _Fields {
    handle,
    created_at_millis,
    num_posts,
    some_date,
    some_datetime,
    bio,
    some_binary,
    some_float,
    some_boolean,
  }

  public User(int id, final String handle, final Long created_at_millis, final int num_posts, final Long some_date, final Long some_datetime, final String bio, final byte[] some_binary, final Double some_float, final Boolean some_boolean, IDatabases databases) {
    super(id);
    this.__handle = handle;
    this.__created_at_millis = created_at_millis;
    this.__num_posts = num_posts;
    this.__some_date = some_date;
    this.__some_datetime = some_datetime;
    this.__bio = bio;
    this.__some_binary = some_binary;
    this.__some_float = some_float;
    this.__some_boolean = some_boolean;
    this.__assoc_posts = new HasManyAssociation<Post>(databases.getDatabase1().posts(), "user_id", id);
    this.__assoc_comments = new HasManyAssociation<Comment>(databases.getDatabase1().comments(), "commenter_id", id);
    this.__assoc_image = new HasOneAssociation<Image>(databases.getDatabase1().images(), "user_id", id);
  }

  public User(int id, final String handle, final Long created_at_millis, final int num_posts, final Long some_date, final Long some_datetime, final String bio, final byte[] some_binary, final Double some_float, final Boolean some_boolean) {
    super(id);
    this.__handle = handle;
    this.__created_at_millis = created_at_millis;
    this.__num_posts = num_posts;
    this.__some_date = some_date;
    this.__some_datetime = some_datetime;
    this.__bio = bio;
    this.__some_binary = some_binary;
    this.__some_float = some_float;
    this.__some_boolean = some_boolean;
  }

  public User (User other) {
    super(other.getId());
    this.__handle = other.getHandle();
    this.__created_at_millis = other.getCreatedAtMillis();
    this.__num_posts = other.getNumPosts();
    this.__some_date = other.getSomeDate();
    this.__some_datetime = other.getSomeDatetime();
    this.__bio = other.getBio();
    this.__some_binary = other.getSomeBinary();
    this.__some_float = other.getSomeFloat();
    this.__some_boolean = other.isSomeBoolean();
  }

  public String getHandle(){
    return __handle;
  }

  public void setHandle(String newval){
    this.__handle = newval;
  }

  public Long getCreatedAtMillis(){
    return __created_at_millis;
  }

  public void setCreatedAtMillis(Long newval){
    this.__created_at_millis = newval;
  }

  public int getNumPosts(){
    return __num_posts;
  }

  public void setNumPosts(int newval){
    this.__num_posts = newval;
  }

  public Long getSomeDate(){
    return __some_date;
  }

  public void setSomeDate(Long newval){
    this.__some_date = newval;
  }

  public Long getSomeDatetime(){
    return __some_datetime;
  }

  public void setSomeDatetime(Long newval){
    this.__some_datetime = newval;
  }

  public String getBio(){
    return __bio;
  }

  public void setBio(String newval){
    this.__bio = newval;
  }

  public byte[] getSomeBinary(){
    return __some_binary;
  }

  public void setSomeBinary(byte[] newval){
    this.__some_binary = newval;
  }

  public Double getSomeFloat(){
    return __some_float;
  }

  public void setSomeFloat(Double newval){
    this.__some_float = newval;
  }

  public Boolean isSomeBoolean(){
    return __some_boolean;
  }

  public void setSomeBoolean(Boolean newval){
    this.__some_boolean = newval;
  }

  public void setField(_Fields field, Object value) {
    switch (field) {
      case handle:
        setHandle((String) value);
        break;
      case created_at_millis:
        setCreatedAtMillis((Long) value);
        break;
      case num_posts:
        setNumPosts((Integer) value);
        break;
      case some_date:
        setSomeDate((Long) value);
        break;
      case some_datetime:
        setSomeDatetime((Long) value);
        break;
      case bio:
        setBio((String) value);
        break;
      case some_binary:
        setSomeBinary((byte[]) value);
        break;
      case some_float:
        setSomeFloat((Double) value);
        break;
      case some_boolean:
        setSomeBoolean((Boolean) value);
        break;
    }
    throw new IllegalStateException("Invalid field: " + field);
  }

  public Set<Post> getPosts() throws IOException {
    return __assoc_posts.get();
  }

  public Set<Comment> getComments() throws IOException {
    return __assoc_comments.get();
  }

  public Image getImage() throws IOException {
    return __assoc_image.get();
  }

  @Override
  public Object getField(String fieldName) {
    if (fieldName.equals("id")) {
      return getId();
    }
    if (fieldName.equals("handle")) {
      return getHandle();
    }
    if (fieldName.equals("created_at_millis")) {
      return getCreatedAtMillis();
    }
    if (fieldName.equals("num_posts")) {
      return getNumPosts();
    }
    if (fieldName.equals("some_date")) {
      return getSomeDate();
    }
    if (fieldName.equals("some_datetime")) {
      return getSomeDatetime();
    }
    if (fieldName.equals("bio")) {
      return getBio();
    }
    if (fieldName.equals("some_binary")) {
      return getSomeBinary();
    }
    if (fieldName.equals("some_float")) {
      return getSomeFloat();
    }
    if (fieldName.equals("some_boolean")) {
      return isSomeBoolean();
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public Object getField(_Fields field) {
    switch (field) {
      case handle:
        return getHandle();
      case created_at_millis:
        return getCreatedAtMillis();
      case num_posts:
        return getNumPosts();
      case some_date:
        return getSomeDate();
      case some_datetime:
        return getSomeDatetime();
      case bio:
        return getBio();
      case some_binary:
        return getSomeBinary();
      case some_float:
        return getSomeFloat();
      case some_boolean:
        return isSomeBoolean();
    }
    throw new IllegalStateException("Invalid field: " + field);
  }

  public Object getDefaultValue(_Fields field) {
    switch (field) {
      case handle:
        return null;
      case created_at_millis:
        return null;
      case num_posts:
        return null;
      case some_date:
        return null;
      case some_datetime:
        return null;
      case bio:
        return null;
      case some_binary:
        return null;
      case some_float:
        return null;
      case some_boolean:
        return null;
    }
    throw new IllegalStateException("Invalid field: " + field);
  }

  public String toString() {
    return "<User"
      + " handle: " + __handle
      + " created_at_millis: " + __created_at_millis
      + " num_posts: " + __num_posts
      + " some_date: " + __some_date
      + " some_datetime: " + __some_datetime
      + " bio: " + __bio
      + " some_binary: " + __some_binary
      + " some_float: " + __some_float
      + " some_boolean: " + __some_boolean
      + ">";
  }
}
