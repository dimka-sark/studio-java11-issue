# With Java 11 studio missing R class in java sources 

## Overview

If module uses JAVA 11 and namespace does not match package in module studio miss R class imports

## Step to reproduce bug

1. Open project
2. Sync project
3. Open `JavaIssue.java`

## Workaround solution
Use Java 1.8 (see `module_without_issue_1_8`)
`or`
Create empty package with namespace name (see `module_without_issue_package`)
