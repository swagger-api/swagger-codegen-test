# Pet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Long**](.md) |  |  [optional]
**name** | [**kotlin.String**](.md) |  | 
**category** | [**Category**](Category.md) |  |  [optional]
**photoUrls** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  | 
**tags** | [**kotlin.Array&lt;Tag&gt;**](Tag.md) |  |  [optional]
**status** | [**inline**](#Status) | pet status in the store |  [optional]

<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | available, pending, sold
