package oopsProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Hashmap<K,V>
{
	class Node
	{
		K key;
		V value;
		public Node(K key,V value)
		{
			this.key=key;
			this.value=value;
		}
	}
	int size;
	LinkedList<Node>[] bucket;
	public Hashmap()
	{
		this.size=0;
		init(4);
	}
	public void init(int n)
	{
		bucket=new LinkedList[n];
		for(int i=0;i<n;i++)
		{
			bucket[i]=new LinkedList<>();
		}
	}
	public int size()
	{
		return this.size;
	}
	public boolean isEmpty()
	{
		return this.size==0;
	}
	private int hashfunction(K key)
	{
		return Math.abs(key.hashCode())%bucket.length;
	}
	private int getBucketIndex(K key, int bucketIndex) {
		int index=0;
		for(Node n:bucket[bucketIndex])
		{
			if(n.key.equals(key))
				return index;
			index++;
		}
		return -1;
	}
	public void put(K key,V value)
	{
		int bucketIndex=hashfunction(key);
		int keyIndex=getBucketIndex(key,bucketIndex);
		if(keyIndex!=-1)
		{
			Node n=bucket[bucketIndex].get(keyIndex);
			n.value=value;
		}
		else
		{
			Node n=new Node(key,value);
			bucket[bucketIndex].add(n);
			size++;
		}
		double lambda= size * 1.0 /bucket.length;
		if(lambda>2.0)
			rehash();
		
	}
	private void rehash() {
		LinkedList<Node>[] bucket1=bucket;
		init(bucket1.length * 2);
		for(int i=0;i<bucket1.length;i++)
		{
			for(Node n:bucket1[i])
			{
				put(n.key,n.value);
			}
		}
		
	}
	public boolean containsKey(K key)
	{
		int bucketIndex=hashfunction(key);
		int keyIndex=getBucketIndex(key,bucketIndex);
		if(keyIndex!=-1)
			return true;
		return false;
	}
	public V get(K key)
	{
		int bucketIndex=hashfunction(key);
		int keyIndex=getBucketIndex(key,bucketIndex);
		if(keyIndex!=-1)
		{
			Node n=bucket[bucketIndex].get(keyIndex);
			return n.value;
		}
		return null;
	}
	public ArrayList<K> keySet()
	{
		ArrayList<K> keys=new ArrayList<>();
		for(int i=0;i<bucket.length;i++)
		{
			for(Node n:bucket[i])
			{
				keys.add(n.key);
			}
		}
		return keys;
	}
	public ArrayList<V> valueSet()
	{
		ArrayList<V> values=new ArrayList<>();
		for(int i=0;i<bucket.length;i++)
		{
			for(Node n:bucket[i])
			{
				values.add(n.value);
			}
		}
		return values;
	}
	public void display()
	{
		for(int i=0;i<bucket.length;i++)
		{
			for(Node n:bucket[i])
			{
				System.out.println(n.key+" "+n.value);
			}
		}
	}
	public K remove(K key)
	{
		int bucketIndex=hashfunction(key);
		int keyIndex=getBucketIndex(key,bucketIndex);
		if(keyIndex!=-1)
		{
			Node n=bucket[bucketIndex].get(keyIndex);
			size--;
			bucket[bucketIndex].remove(n);
			return n.key;
		}
		return null;
	}
	public static void main(String[] args) {
		Hashmap<String,Integer> map=new Hashmap<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			map.put(sc.next(), sc.nextInt());
		}
		System.out.println(map.keySet());
		System.out.println(map.valueSet());
		System.out.println(map.containsKey("Imran"));
		sc.close();
	}

}
