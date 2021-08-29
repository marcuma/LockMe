package com.simplilearn.lockme.repository;

import com.simplilearn.lockme.model.User;

import java.io.*;
import java.util.HashSet;

/**
 * Created: 08/28/2021 - 1:59 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public abstract class Repository {

    protected String file;
    private Object object;

    public Repository(Object object) {
        this.object = object;
    }
    public Repository() {}


    public Object getObject() {
        FileInputStream fin = null;
        ObjectInputStream oin = null;


        try {
            fin = new FileInputStream(file);
            oin = new ObjectInputStream(fin);
            object = oin.readObject();
            System.out.println(object);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException cnf) {
            cnf.printStackTrace();
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            if (oin != null) {
                try {
                    oin.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return this.object;
    }

    public void save() {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;

        try {
            fout = new FileOutputStream(file);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(object);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
